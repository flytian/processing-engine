package akura.crawler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class Review {
	private String review_id;
    private String title;
	private int rating;
	private String url;
    private Date date;
	private String reviewContent;
	private int classLabel;
	
	public Review()
    {
		review_id ="";
		rating = 0;
		url = "";
        title = "";
		date = null;
		reviewContent = "";
		classLabel = 0;
	}

	public Review(String review_id, String title, int rating, String url, Date date, String review, int classLabel){
		this.review_id = review_id;
		this.rating = rating;
		this.url = url;
        this.title = title;
		this.date = date;
		this.reviewContent = review;
		this.classLabel = classLabel;
	}

	public String toString()
	{
		return classLabel + ","+ reviewContent ;
	}

	public JSONObject getJSONObject() throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put("review_id", this.review_id);
		obj.put("title", this.title);
		obj.put("rating", new Integer(this.rating));
		obj.put("url", this.url);
		obj.put("date", String.valueOf(this.date));
		obj.put("reviewContent", this.reviewContent);
		obj.put("classLabel", this.classLabel);

		return obj;
	}

	public void printReviews(){
		System.out.println("Review id : " + this.review_id);
		System.out.println("Title : " + this.title);
		System.out.println("Stars : " + this.rating);
		System.out.println("URL : " + this.url);
		System.out.println("Date : " + this.date);
		System.out.println("Review : " + this.reviewContent);
		System.out.println("ClassLabel : " + this.classLabel);
		System.out.println("==================================");
		System.out.println();
	}
}
