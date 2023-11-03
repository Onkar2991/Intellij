package Factory_Method_Dp;

public class Service
{
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        Notification notification= notificationFactory.createNotification("Push");
        notification.notifyUser();
    }
}
