package main;

import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class XSLTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TransformerFactory tff = TransformerFactory.newInstance();
			
			Templates t = tff.newTemplates(new StreamSource(new FileInputStream("src/xslt/MyStyleSheet.xsl")));
			
			Transformer tf = t.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			
			Source s = new StreamSource(new FileInputStream("src/xml/文档2.xml"));
			Result out = new StreamResult(new FileOutputStream("src/xml/文档3.xml"));
			tf.transform(s, out);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(TransformerConfigurationException e) {
			e.printStackTrace();
		}catch(TransformerException e) {
			e.printStackTrace();
		}
	}

}
