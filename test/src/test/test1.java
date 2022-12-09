package test;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;

public class test1 {
	static String personURI    = "http://somewhere/JohnSmith";
	static String fullName     = "John Smith";
	public static void main(String[] args) {
		// some definitions


		// create an empty Model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		Resource johnSmith = model.createResource(personURI);

		// add the property
		johnSmith.addProperty(VCARD.FN, fullName);
		model.write(System.out);
	
}
}
