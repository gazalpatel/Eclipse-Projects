package com.balazsholczer.search;

import java.util.Random;

public class StochasticSearch 
{

	public static double f(double x)
	{
		// function has +2
		return -(x-1)*(x-1) +2;
	}
	public static void main(String[] args)
	{
		//returns double between 0 to 1
		Random random = new Random();
		
		double startPointX = 0;
		
		double max = f(startPointX);
		
		//more the iteration -> more chances of getting better result
		//but still it depends on generated random number
		 
		for(int i = 0; i<10; i++)
		{
			//we multiply with 2 because our function has (+2) 
			double index = 2 * random.nextDouble();
			
			if(f(index) > max)
			{
				max = f(index);
			}
		}
		
		System.out.println("Maximum value y=f(x) is   "+max);
	}
}


/*
 * Used Function:
 *  
 				   4*
 				    
 				   3*
 				  
 				   2 ###
 				    #   #
 			      1#     #
 			     #         #
6* 5* 4* 3* 2 1*#  0* 1*    # 2* 3* 4* 5* 6* 7* 
 			   #   1*        #
 		      #			      #	
 		     #     2*          #
 		    #   			    #
 		   #  	   3*           #
 		   #				     #
 		  #   	   4*            #
 				   
 				   5* 
 				   
 				    
 *
 * 
 * Output is based on random 
 * 
 * Output 1:
 * Maximum value y=f(x) is   1.9924618120058535
 * 
 * 
 * Output 2:
 * Maximum value y=f(x) is   1.9989069437768818
 *
 *
 *
 */
