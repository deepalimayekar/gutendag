package corelib.services.web.samples.virtualcaddy.webpages;
import corelib.services.web.components.Button;
import corelib.services.web.components.TextBox;
import corelib.services.web.components.OutputText;
import corelib.services.web.components.events.ActionEvent;
import corelib.services.web.components.events.ActionListener;

public class Login extends WebPage {

private Button b;
private TextBox t1;
private TextBox t2;
private OutputText o;


public void b_actionPerformed(ActionEvent a){
String login = t1.getvalue();
String password = t2.getvalue();

check if the login and password combination returns a user class, if Yes, - messge and navigate to next view , if NO, message and stop

}

public void loadPage( )
}
