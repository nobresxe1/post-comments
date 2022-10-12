package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH.");

		Comment c1 = new Comment("Have nice trip!");
		Comment c2 = new Comment("Wow that`s awesome!");
		Post p1 = new Post(
				sdf.parse("10/10/2022    13:42:31"), 
				"Traveling to New Zeland",
				"I`m going to visit this wonderful country ", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("08/10/2022    22:42:31"), 
				"Good night guys",
				"See you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}
}
