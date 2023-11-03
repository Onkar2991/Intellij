package Factory_Method_Dp;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending push notification");
    }
}
