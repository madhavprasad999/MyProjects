
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class Dictionary {
	private static final String FILENAME="Resources/morsecode.xml";
	private static final String NODE_SYMBOL="symbol";
	private static final String NODE_POSITIONL="position";
	private static final String NODE_CODE="code";
	private static final String ATT_NAME="name";
	
	private static MorseTree MORSE_TREE=new MorseTree();
	 Dictionary(){
		 processFile();
	 }
	 
	 
	 
	 
	 private void processFile() {
		 DocumentBuilderFactory dbf=null;
		 DocumentBuilder db=null;
		 Document doc=null;
		 
		 
		 dbf=DocumentBuilderFactory.newInstance();
         try {
        	 dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
         } catch (ParserConfigurationException e) {
        	 e.printStackTrace();
        	 System.out.print("Error setting secure feature");
         }
         
        try {
        	// setting document builder
        	db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
			e.printStackTrace();
			System.out.print("Error during building document.");
		}
        

    	try {
    		//parsing file.
    		doc = db.parse(new File(FILENAME));
		} catch (SAXException | IOException e) {
			e.printStackTrace();
			System.out.print("Error duringparsing file.");
		}
    	
    	//normalize the file to make file even - remove unnecessary line breaks.
    	doc.getDocumentElement().normalize();
        
    	//get symbols.
    	NodeList items=doc.getElementsByTagName(NODE_SYMBOL);
    	
    	for(int i=0;i<items.getLength();i++) {
    		Node node=items.item(i);
    		Element thisSymbol=(Element) node;
    		String name=thisSymbol.getAttribute(ATT_NAME);
    		String code=thisSymbol.getElementsByTagName(NODE_CODE).item(0).getTextContent();
    		Integer position=Integer.parseInt(thisSymbol.getElementsByTagName(NODE_POSITIONL).item(0).getTextContent());
    		
    		MorseSymbol ms=new MorseSymbol(name,code,position);
    		MORSE_TREE.add(ms);
    	}
    	
    	
	 }
	 
	 
	 
}
