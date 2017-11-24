package app.util;

import lombok.*;

public class Path {

	// The @Getter methods are needed in order to access
	// the variables from Velocity Templates
	public static class Web {
		@Getter
		public static final String INDEX = "/index/";
		@Getter
		public static final String LOGIN = "/login/";
		@Getter
		public static final String LOGOUT = "/logout/";
		@Getter
		public static final String BOOKS = "/books/";
		@Getter
		public static final String ONE_BOOK = "/books/:isbn/";

		public static String getINDEX() {
			return INDEX;
		}

		public static String getLOGIN() {
			return LOGIN;
		}

		public static String getLOGOUT() {
			return LOGOUT;
		}

		public static String getBOOKS() {
			return BOOKS;
		}

		public static String getONE_BOOK() {
			return ONE_BOOK;
		}
	}

	public static class Template {
		public final static String INDEX = "/velocity/index/index.vm";
		public final static String LOGIN = "/velocity/login/login.vm";
		public final static String BOOKS_ALL = "/velocity/book/all.vm";
		public static final String BOOKS_ONE = "/velocity/book/one.vm";
		public static final String NOT_FOUND = "/velocity/notFound.vm";

		public static String getINDEX() {
			return INDEX;
		}

		public static String getLOGIN() {
			return LOGIN;
		}

		public static String getBOOKS_ALL() {
			return BOOKS_ALL;
		}

		public static String getBOOKS_ONE() {
			return BOOKS_ONE;
		}

		public static String getNOT_FOUND() {
			return NOT_FOUND;
		}

	}

}
