package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup{
	public AddTodoTest() throws IOException {
		super();
		
}
	TodoPage todoPage;
	
	@Test
	public void iCanAddTodo() throws IOException {
		
		todoPage = new TodoPage();
		boolean elementText = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String element = todoPage.checkElementContains(TodoPage.elementTodo);
		Assert.assertTrue(element.contains(prop.getProperty("todo1")));
		boolean checkBox = todoPage.isCheckBoxSelected(TodoPage.checkbox);
		Assert.assertFalse(checkBox);
	}
	
	}