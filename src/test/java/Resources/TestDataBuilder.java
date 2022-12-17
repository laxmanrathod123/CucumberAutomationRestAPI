package Resources;

import java.util.ArrayList;
import java.util.List;

import POJO.AddPlace;
import POJO.Location;

public class TestDataBuilder {
	
	public AddPlace addplacepayload() {
		AddPlace p= new AddPlace();
		Location l= new Location();
		
		l.setLat(-38.383494);
		l.setLng(33.427362);

		p.setLocation(l);
		p.setAccuracy(50);
		p.setName("Rahul Shetty house");
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress("29, side layout, cohen 09");
		
		List<String> myList= new ArrayList<>();
		myList.add("shoe park");
		myList.add("shop");
		
		p.setTypes(myList);
		p.setWebsite("http://google.com");
		p.setLanguage("French-IN");
		
		return p;
		
	}
	
	

}
