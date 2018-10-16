<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_label.label display inlin (1)</name>
   <tag></tag>
   <elementGuidId>41901169-e65a-41ae-872c-13b9f5be2047</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>








label,.label {
	display: inline;
}

span.errorMessage {
	display: none;
}


table#myTableInf tr {
	border: 1px solid #D9D9D9;
}



	function FrmSubmit() {
		var date = trim(document.perForm.from.value);
		var to = trim(document.perForm.to.value);
		
		if (date == &quot;&quot;) {
			document.getElementById('showerror').style.display = '';
			return false;
		} else if (date != &quot;&quot; &amp;&amp; to == &quot;&quot;) {
			document.getElementById('showerror').style.display = '';
			return false;
		}  
		
		if (to != &quot;&quot;) {
			var date1 = new Date(date);
			var date2 = new Date(to);
			var diff = new Date(date2.getTime() - date1.getTime());
			//	alert(diff.getUTCMonth());
			var diff_mon = diff.getUTCMonth();
			if (diff_mon > 0) {
				alert(&quot;Date difference should be lessthan one month&quot;);
				document.getElementById('showdateerror').style.display = '';
				return false;
			}
		}

	}

	function trim(s) {
		return s.replace(/^\s*/, &quot;&quot;).replace(/\s*$/, &quot;&quot;);
	}
	function Exceldownload(){
	 	  $(&quot;#myTableInf&quot;).table2excel({
		    // exclude CSS class
		    exclude: &quot;.noExl&quot;,
		    name: &quot;Worksheet Name&quot;,
		    filename: &quot;LogisticsLegalisationImmi&quot; //do not include extension
		  }); 
		}


	
	
    	
        
        
            
            
            
            


            
            
                
                    
                        
                        

	    

    
                            
                            
                    
                    
                        
                        
	                        
                        
                        
                    
                
                
             
            
            
            
            
            
            
            
            
            
            
				  				  
							  
								
								 
								
							  
				

             
            
            
            
                
                    
                       
                       
                       
                       
             							
             
                       
                       			
								
									
									
									 
										
										
										Ticket
										
										
										
										Verify Record
										
										
										
										Delivery Report
										
										
										
										Performance Report
										
										Immigration Report
													
										User MGMT

                                         Download Apk File
                                         
										
										Change Password
										
										
												
										
												
												Logout
												
									
										
										
									 
										
																				
									
								
                       
                       
                       
                        
                    
                
                
             
         
        
		
			
			
	
	
		» Please select Date Range to view data.
	
	
	
		
		
		
		
			
				»
						Date difference should be lessthan one month.
			
		
		
		
			
			
			
			Process Filter:(reset)
			
				

					
    Date:
     
	
		
			
				
					
						
							
							
								
									
								
								
									
								
								
									
								
								
									
								
								August
							
							
						
					
				
			
		
		
			
				
					
						
							
								S
								M
								T
								W
								T
								F
								S
							
						
						
								29
								30
								31
								1
								2
								3
								4
							
								5
								6
								7
								8
								9
								10
								11
							
								12
								13
								14
								15
								16
								17
								18
							
								19
								20
								21
								22
								23
								24
								25
							
								26
								27
								28
								29
								30
								31
								1
							
								2
								3
								4
								5
								6
								7
								8
							
					
				
			
		
		
			
				
					
						
							
							
								
									2017
									2018
									2019
								
							
							
						
					
				
			
		
	




djConfig.searchIds.push(&quot;widget_1420873699&quot;);

					
    Date:
     
	
		
			
				
					
						
							
							
								
									
								
								
									
								
								
									
								
								
									
								
								August
							
							
						
					
				
			
		
		
			
				
					
						
							
								S
								M
								T
								W
								T
								F
								S
							
						
						
								29
								30
								31
								1
								2
								3
								4
							
								5
								6
								7
								8
								9
								10
								11
							
								12
								13
								14
								15
								16
								17
								18
							
								19
								20
								21
								22
								23
								24
								25
							
								26
								27
								28
								29
								30
								31
								1
							
								2
								3
								4
								5
								6
								7
								8
							
					
				
			
		
		
			
				
					
						
							
							
								
									2017
									2018
									2019
								
							
							
						
					
				
			
		
	




djConfig.searchIds.push(&quot;widget_1805886715&quot;);
	
					
					
				
			

			

			
			
				
				
					
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

			
			
			
			
         
				
           
        
        
        	
            	    
                	

                	All logos and trademarks in this site are the property of their respective owners.© 2000-2015 MyEG Services Berhad. All Rights Reserved. 
        		
            
            
         
	
/html[1]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
   </webElementProperties>
</WebElementEntity>
