//package cmpe239.parser;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.UnsupportedEncodingException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//
//import cmpe239.jsontocsv.domainobjects.BusinessObject;
//
//
//public class Jsontocsv {
//	
//	public static void main(String args[]) throws IOException, FileNotFoundException{
//		Jsontocsv js=new Jsontocsv();
//		String line=null;
//		String file="/home/shivadeepthi/Desktop/cmpe239/yelp_dataset_challenge_academic_dataset/yelp_academic_dataset_business.json";
//		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file),"ISO-8859-1"));
//		List<BusinessObject> arrayList=new ArrayList<BusinessObject>();
//		 while ((line = bufferedReader.readLine()) != null) {
//			    System.out.println("json file line " + line); 
//			     BusinessObject obj=js.fromJson(line);
//			    arrayList.add(obj);
//			   }
//		 writeToCsv(arrayList);
//		bufferedReader.close();
//	}
//	public BusinessObject fromJson(String line) throws JsonParseException, JsonMappingException, IOException{
//
//		ObjectMapper objectMapper = new ObjectMapper().configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
//		BusinessObject businessObject=objectMapper.readValue(line, BusinessObject.class);
//		//BusinessObject businessObject=objectMapper.readValue(line, BusinessObject.class);
//		
//		return businessObject;
//	}
//	public static void writeToCsv(List<BusinessObject> arrayList) throws IOException{
//		 String CSV_SEPARATOR = ",";
////		 String Attribute_sep="|";
//		System.out.println("inside csv method");
//		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/shivadeepthi/Desktop/cmpe239/yelp_dataset_challenge_academic_dataset/business1.csv"), "UTF-8"));	
//		 bw.write("business_id,open,categories,city,review_count,name,longitude,state,stars,latitude,type");
//		 bw.newLine();
//		 for(BusinessObject bObject:arrayList){
//			 //System.out.println(bObject.getCategories()[1]);
//			 if(bObject.getCategories() == null || bObject.getCategories().length == 0)
//			 {
//				 continue;
//			 }
//			 List<String> categories = new ArrayList<String>();
//			 for(int i = 0; i < bObject.getCategories().length; i++)
//			 {
//				 categories.add(bObject.getCategories()[i]);
//				 
//			 }
//			 if(categories.contains("restaurants") || categories.contains("Restaurants")){
//			 StringBuffer oneLine = new StringBuffer();
//             oneLine.append("\""+bObject.getBusiness_id()+  "\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\"");
//             for(int i=0;i<bObject.getCategories().length;i++)
//             oneLine.append(bObject.getCategories()[i]+",");
//             oneLine.append("\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\""+bObject.getCity()+"\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\""+bObject.getReview_count()+"\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\"");
//             oneLine.append(bObject.getName().contains(",")?bObject.getName().replace(",","").replace("\"", ""):bObject.getName());
//             oneLine.append("\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\"");
//             oneLine.append(bObject.getLongitude());
//             oneLine.append("\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\"");
//             oneLine.append(bObject.getState());
//             oneLine.append("\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\"");
//             oneLine.append(bObject.getStars());
//             oneLine.append("\"");
//             oneLine.append(CSV_SEPARATOR);
//             oneLine.append("\"");
//             oneLine.append(bObject.getLatitude());
//             oneLine.append("\"");
//             oneLine.append(CSV_SEPARATOR);
//            oneLine.append("\"");
//            oneLine.append(bObject.getType());
//            oneLine.append("\"");
//            bw.write(oneLine.toString());
//            bw.newLine();
//			 }else {
//				 System.out.println("it's not a restuarent");
//			 }
//        
//		 }
//		 bw.flush();
//         bw.close();
//			 
//	}
//}