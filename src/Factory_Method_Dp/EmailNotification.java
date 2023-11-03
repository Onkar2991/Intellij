package Factory_Method_Dp;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending email notification");
    }
}
