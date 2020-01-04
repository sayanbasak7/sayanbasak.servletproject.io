package com.cognizant.moviecruiser.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruiser.dao.MoviesDaoCollectionImpl;
import com.cognizant.moviecruiser.model.Movies;

/**
 * Servlet implementation class ShowMovielistCustomerServlet
 */
@WebServlet("/ShowMovielistCustomer")
public class ShowMovielistCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowMovielistCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MoviesDaoCollectionImpl moviesDao = new MoviesDaoCollectionImpl();
		List<Movies> moviesListCustomer = moviesDao.getMoviesListCustomer();
		request.setAttribute("moviesList", moviesListCustomer);
		RequestDispatcher rd = request.getRequestDispatcher("movie-list-customer.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
