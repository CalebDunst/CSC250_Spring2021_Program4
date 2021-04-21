import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Driver 
{
	
	public static void main(String[] args)
	{ 
		URLReader hearthstoneURLReader = new URLReader("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		//System.out.println(hearthstoneURLReader.getTheURLContents());
		
		Object obj = JSONValue.parse(hearthstoneURLReader.getTheURLContents());
		HearthstoneCard[] theMinions = new HearthstoneCard[1924];
		//System.out.println(obj instanceof JSONArray);
		
		if(obj instanceof JSONArray)
		{
			
		//I am only in here if obj IS a JSONArray
		JSONArray array = (JSONArray)obj;
		int count = 0;
		
		for(int i = 0; i < array.size(); i++)
		{
			
			JSONObject cardData = (JSONObject)array.get(i);
			if(cardData.containsKey("cost") && cardData.containsKey("name") && cardData.containsKey("type") && cardData.get("type").equals("MINION"))
			{
				
				 
				 
				 HearthstoneCard cardNo = new HearthstoneCard(cardData.get("name"), cardData.get("cost"), cardData.get("attack"), cardData.get("health"));
				theMinions[count] = cardNo;
				count++;
			}
			
			
			
		}
		
		} for(int b=0; b<1924; b++) {
			theMinions[b].display();
		}
		System.out.println(theMinions.length);
	}
		
}