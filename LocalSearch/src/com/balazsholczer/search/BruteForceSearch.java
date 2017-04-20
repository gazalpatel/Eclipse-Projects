package com.balazsholczer.search;

//find the value of x where given function has maximum value

//error in result depends on dx - moving difference constant

public class BruteForceSearch
{

	public static double f(double x)
	{
		return -(x*x)+2;
	}
	
	public static void main(String[] args)
	{
		//Starting x position
		double startPositionX = -2;
		
		//x position where value of function is maximum 
		double maximumX = startPositionX;
		
		//difference to move in function
		double dx = 0.1;
		
		//value of function where it is found maximum
		double max = f(startPositionX);
		
		for(double i = startPositionX; i<2 ; i+=dx)
		{
			if(f(i) > max)
			{
				max = f(i);
				maximumX = i;
			}
		}
		
		System.out.println("The maximum is at: "+ maximumX + " & y =" + f(maximumX));
		
		//System.out.println("The maximum is at");
		
	}
}

/*
 * Used Function:
 *  
 				   4*
 				    
 				   3*
 				  (2)
 				  ###
 				#     #
 			   #   1*  #
 			  #         #
6* 5* 4* 3* 2# 1*  0* 1* # 2* 3* 4* 5* 6* 7* 
 			#      1*     #
 		   #			   #	
 		  #        2*       #
 		 #					 #
 		 #  	   3*        #
 		# 					  #
 		#	   	   4*         #
 				   
 				   5* 
 				   
 				    
 *
 * 
 * Output for dx = 0.1
 * The maximum is at: 6.38378239159465E-16 & y =2.0
 * 
 * 
 * Output for dx = 0.01
 * The maximum is at: 1.6410484082740595E-15 & y =2.0
 */
