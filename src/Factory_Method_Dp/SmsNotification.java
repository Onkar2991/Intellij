package Factory_Method_Dp;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sms notification sent");
    }
}
