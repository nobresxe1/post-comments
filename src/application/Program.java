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
				sdf.parse("21/10/2022    13:42:31"), 
				"Traveling to New Zeland",
				"I`m going to visit this wonderful country ", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);

	}
}
