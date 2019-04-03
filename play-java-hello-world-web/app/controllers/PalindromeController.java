package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class PalindromeController extends Controller{
	
	public Result enterPalindrome() {
	return ok(views.html.palindromeCheck.render());
}
}