package org.example;

public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("------ Email Only ------");

        Notifier email = new EmailNotifier();

        email.send("Assignment Submitted");

        System.out.println();

        System.out.println("------ Email + SMS ------");

        Notifier emailSMS =
                new SMSNotifierDecorator(
                        new EmailNotifier());

        emailSMS.send("Assignment Submitted");

        System.out.println();

        System.out.println("------ Email + SMS + Slack ------");

        Notifier allNotifications =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allNotifications.send("Assignment Submitted");

    }
}