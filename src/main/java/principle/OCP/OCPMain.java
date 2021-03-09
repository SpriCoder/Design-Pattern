package principle.OCP;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Author stormbroken
 * 结合 XML + DOM + Java Reflect 模拟开闭原则
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class OCPMain {
    public static void main(String[] args) {
        String prefix = "src/main/java/principle/ocp/";
        try{
            File f = new File(prefix + "Config.xml");
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList root=doc.getElementsByTagName("button");
            for(int i = 0; i < root.getLength(); i ++){
                String className = doc.getElementsByTagName("className").item(i).getTextContent();
                String message = doc.getElementsByTagName("message").item(i).getTextContent();

                // xml + Config.xml
                Class<?> button = Class.forName("principle.ocp." + className);
                AbstractButton abstractButton = (AbstractButton) button.newInstance();
                abstractButton.setMessage(message);
                LoginForm loginForm = new LoginForm();
                loginForm.setAbstractButton(abstractButton);
                loginForm.display();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
