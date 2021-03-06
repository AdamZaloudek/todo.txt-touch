/**
 *
 * Todo.txt Touch /tests/src/com/todotxt/todotxttouch/test/TodoTxtTouchTest.java
 *
 * Copyright (c) 2009-2011 Stephen Henderson
 *
 * LICENSE:
 *
 * This file is part of Todo.txt Touch, an Android app for managing your todo.txt file (http://todotxt.com).
 *
 * Todo.txt Touch is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any
 * later version.
 *
 * Todo.txt Touch is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with Todo.txt Touch.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 * @author Stephen Henderson <me[at]steveh[dot]ca>
 * @license http://www.gnu.org/licenses/gpl.html
 * @copyright 2009-2011 Stephen Henderson
 */
package com.todotxt.todotxttouch.test;

import com.todotxt.todotxttouch.TodoTxtTouch;
import android.test.ActivityInstrumentationTestCase2;

public class TodoTxtTouchTest extends
		ActivityInstrumentationTestCase2<TodoTxtTouch> {

	@SuppressWarnings("unused")
	// TODO: Remove
	private TodoTxtTouch m_activity;

	public TodoTxtTouchTest() {
		super("com.todotxt.todotxttouch", TodoTxtTouch.class);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		m_activity = this.getActivity();
	}
}
