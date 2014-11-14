package cmpe239.parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.ArrayList;

import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import cmpe239.jsontocsv.domainobjects.Reviews;

public class JsontocsvReview {
		
		public static void main(String args[]) throws IOException, FileNotFoundException{
			JsontocsvReview js=new JsontocsvReview();
			String line=null;
			String file="C:/Users/deepthi/Desktop/cmpe239prject/yelp_academic_dataset_review.json";
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file),"ISO-8859-1"));
			List<Reviews> arrayList=new ArrayList<Reviews>();
			 while ((line = bufferedReader.readLine()) != null) {
				    System.out.println("json file line " + line); 
				     Reviews obj=js.fromJson(line);
				    arrayList.add(obj);
				   }
			 System.out.println("writing into csv");
			 writeToCsv(arrayList);
			bufferedReader.close();
		}
		public Reviews fromJson(String line) throws JsonParseException, JsonMappingException, IOException{

//			ObjectMapper objectMapper = new ObjectMapper().configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
			ObjectMapper objectMapper = new ObjectMapper();
			Reviews reviewObject=objectMapper.readValue(line, Reviews.class);
			
			return reviewObject;
		}
		public static void writeToCsv(List<Reviews> arrayList) throws IOException{
			 String CSV_SEPARATOR = ",";
			 System.out.println("inside csv method");
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/deepthi/Desktop/reviews.csv"), "UTF-8"));	
			 System.out.println("business_id,review_id,user_id,stars,text,date");
			 bw.write("business_id,review_id,user_id,stars,text,date");
			 bw.newLine();
			 for(Reviews bObject:arrayList){
//				 if(bObject.getBusiness_id()!=null && bObject.getReview_id()!=null){
				 StringBuffer oneLine = new StringBuffer();
				 oneLine.append("\"");
				 oneLine.append(bObject.getBusiness_id());
				 oneLine.append("\"");
				 oneLine.append(CSV_SEPARATOR);
				 oneLine.append("\"");
				 oneLine.append(bObject.getReview_id());
				 oneLine.append("\"");
				 oneLine.append(CSV_SEPARATOR);
				 oneLine.append("\"");
				 oneLine.append(bObject.getUser_id());
				 oneLine.append("\"");
				 oneLine.append(CSV_SEPARATOR);
				 oneLine.append("\"");
				 oneLine.append(bObject.getStars().equals("")?bObject.getStars().replace("", "3"):bObject.getStars());
				 oneLine.append("\"");
				 oneLine.append(CSV_SEPARATOR);
				 oneLine.append("\"");
				 oneLine.append(bObject.getText().replace("\"", "").replace(",","").replace("\"\"", "").replace("\'","").replace("\n", "").replace("\r", ""));
				 oneLine.append("\"");
				 oneLine.append(CSV_SEPARATOR);
				 oneLine.append("\"");
				 oneLine.append(bObject.getDate().replace("\"",""));
				 oneLine.append("\""); 
				 bw.write(oneLine.toString());
    	            bw.newLine();
//			 }else {
//				 System.out.println("business id and review id null");
//			 }
			 }
			 bw.flush();
	         bw.close();
				 
		}
	}

