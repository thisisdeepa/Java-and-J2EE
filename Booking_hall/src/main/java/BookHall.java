import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;

/**
 * Servlet implementation class BookHall
 */
@WebServlet("/BookHall")
public class BookHall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookHall() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		    int id = Integer.parseInt(request.getParameter("Id"));
		    String hall =  request.getParameter("Hall");
		    String event = request.getParameter("event");
	        String name = request.getParameter("name");
	        String from = request.getParameter("from");
	        String to = request.getParameter("to");
	        String theme = request.getParameter("Theme");
	        double billAmount = 0.0;
	        PrintWriter out = response.getWriter();
	        if(hall.equals("AUDI 1")) {
	        	billAmount = 100000.00;
	        }
	        else if(hall.equals("AUDI 2")) billAmount = 200000.00;
	        else if(hall.equals("AUDI 3")) billAmount = 300000.00;
	        else if(hall.equals("AUDI 4")) billAmount = 440000.00;
	        
	        
	        
	        out.print("<html><body><p>" + "---------------Here is Your Booking Details-------------<br><br>Booking Id : " + id + "<br></p><p>Hall Selected : " + hall + "</p>");
	        out.print("<p>Cause for Booking : " + event + "</p><p>Booked By : " + name + "</p><p>Booked From : "+ from + "</p><p>Booked Till"+ to
	              + "</p><p>Theme Selected : "+ theme +"</p><br>Your total booking amount is " + billAmount + "</body></html>");
	        
	        try{
	        	Statement s = (Statement)DatabaseInstance.getInstance().createStatement();
	        	
	        	String insertIntoTable = String.format("insert into HallBookingDetails (customerId, hall, event, name, fromDate, toDate, theme, billAmount)"
	        			+ " values (%d, '%s','%s','%s','%s','%s','%s', %f)", 
	        			id, hall, event, name, from, to, theme, billAmount);
	        	
	        	int rs = s.executeUpdate(insertIntoTable);
	        
	        	System.out.println("booking sucessfull");
	        	
	        	
	        	String getAllBookings = String.format("select * from HallBookingDetails");
				 
				 ResultSet fetchQueryResult = s.executeQuery(getAllBookings);
				 
				 System.out.println("Booking so far are:  ");
				 
				 while(fetchQueryResult.next()){
			            //Display values
			            System.out.print("ID: " + fetchQueryResult.getInt("customerId"));
			            System.out.print(", Hall Name: " + fetchQueryResult.getString("hall"));
			            System.out.print(", Event name: " + fetchQueryResult.getString("event"));
			            System.out.print(", Customer Name: " + fetchQueryResult.getString("name"));
			            System.out.print(", Booked from: " + fetchQueryResult.getString("fromDate"));
			            System.out.print(", Booked to: " + fetchQueryResult.getString("toDate"));
			            System.out.print(", Theme: " + fetchQueryResult.getString("theme"));
			            System.out.println(", Bill Amount: " + fetchQueryResult.getDouble("billAmount"));
			         }
	        	
	        	
	        }catch(Exception e){
	        	System.out.println("Error while inserting into database " + e.toString());
	        }
	        
	        

	}

	
}