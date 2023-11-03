package Factory_Method_Dp;

public class NotificationFactory


{
    public Notification createNotification(String Notification)
    {
        if (Notification == null || Notification.isEmpty())
            return null;

        switch (Notification)
        {
            case "SMS":
                return new SmsNotification();
            case "Email":
                return new EmailNotification();
            case "Push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown Notification " + Notification);
        }
    }
}