package sena;

import javax.annotation.Resource;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.VCARD;
import org.apache.jena.rdf.model.Resource;

public class testsena {

	static String personURI    = "http://somewhere/JohnSmith";
	static String fullName     = "John Smith";
	public static void main(String[] args) {
		// some definitions


		// create an empty Model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		 johnSmith = (Resource) model.createResource(personURI);

		// add the property
		johnSmith.addProperty(VCARD.FN, fullName);
		model.write(System.out);
	
}
}
