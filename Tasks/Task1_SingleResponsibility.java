public class Task1_SingleResponsibility 
{
    public static void main(String[] args) 
    {
        User a = new User();
        EmailService b = new EmailService();

        a.login(null, null);
        b.sendMail(null, null, null);
    }
}

class User 
{
    public void login(String username, String password)
    {
        System.out.println("SignIn");
    }
}

class EmailService 
{
    public void sendMail(String to, String subject, String body) 
    {
        System.out.println(" Email");
    }
}