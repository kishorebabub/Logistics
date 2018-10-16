<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_MyEG Services  PERFORMANC</name>
   <tag></tag>
   <elementGuidId>587fd035-ac68-405c-9259-a37b03c083a5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
		
		
		 
		
		

		MyEG Services | PERFORMANCE REPORT
		
		
			@import url(../css/reset.css); 
			@import url(../css/grid.css);
			@import url(../css/styles.css); 
			@import url(../css/theme-red.css);
			@import url(../css/theme.bluetable.css);
			
			@import url(../css/jquery.wysiwyg.css);
			@import url(../css/tablesorter.css);
			@import url(../css/thickbox.css);
			@import url(../css/ie6.css);
			@import url(../css/ie.css);
		

		
		
		
		
		
		
		
		
		
		
		
       
		
			$(function()
			{
			$('#wysiwyg').wysiwyg(
			{
			controls : {
			separator01 : { visible : true },
			separator03 : { visible : true },
			separator04 : { visible : true },
			separator00 : { visible : true },
			separator07 : { visible : false },
			separator02 : { visible : false },
			separator08 : { visible : false },
			insertOrderedList : { visible : true },
			insertUnorderedList : { visible : true },
			undo: { visible : true },
			redo: { visible : true },
			justifyLeft: { visible : true },
			justifyCenter: { visible : true },
			justifyRight: { visible : true },
			justifyFull: { visible : true },
			subscript: { visible : true },
			superscript: { visible : true },
			underline: { visible : true },
            increaseFontSize : { visible : false },
            decreaseFontSize : { visible : false }
			}
			} );
			});
        
        
        
       
		
		$(function() {
	// call the tablesorter plugin
	$(&quot;table&quot;).tablesorter({
		theme : 'blue',

		dateFormat : &quot;mmddyyyy&quot;, // set the default date format

		// or to change the format for specific columns, add the dateFormat to the headers option:
		headers: {
			0: { sorter: &quot;shortDate&quot; } //, dateFormat will parsed as the default above
			// 1: { sorter: &quot;shortDate&quot;, dateFormat: &quot;ddmmyyyy&quot; }, // set day first format; set using class names
			// 2: { sorter: &quot;shortDate&quot;, dateFormat: &quot;yyyymmdd&quot; }  // set year first format; set using data attributes (jQuery data)
		}

	});
});
        
        
		
			$(function() {
			$('.password').pstrength();
			});
        
        
        
        
		
    // Dojo configuration
    djConfig = {
        isDebug: false,
        bindEncoding: &quot;UTF-8&quot;
          ,baseRelativePath: &quot;/logistic/struts/dojo/&quot;
          ,baseScriptUri: &quot;/logistic/struts/dojo/&quot;
         ,parseWidgets : false
        
    };




  .dojoLayoutContainer{ position: relative; display: block; overflow: hidden; }
body .dojoAlignTop, body .dojoAlignBottom, body .dojoAlignLeft, body .dojoAlignRight { position: absolute; overflow: hidden; }
body .dojoAlignClient { position: absolute }
.dojoAlignClient { overflow: auto; }
.datePickerContainer {
	width:164px; /* needed for proper user styling */
}

.calendarContainer {
/*	border:1px solid #566f8f;*/
}

.calendarBodyContainer {
	width:100%; /* needed for the explode effect (explain?) */
	background: #7591bc url(/logistic/struts/dojo/src/widget/templates/images/dpBg.gif) top left repeat-x;
}

.calendarBodyContainer thead tr td {
	color:#293a4b;
	font:bold 0.75em Helvetica, Arial, Verdana, sans-serif;
	text-align:center;
	padding:0.25em;
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpHorizLine.gif) bottom left repeat-x;
}

.calendarBodyContainer tbody tr td {
	color:#fff;
	font:bold 0.7em Helvetica, Arial, Verdana, sans-serif;
	text-align:center;
	padding:0.4em;
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpVertLine.gif) top right repeat-y;
	cursor:pointer;
	cursor:hand;
}


.monthWrapper {
	padding-bottom:2px;
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpHorizLine.gif) bottom left repeat-x;
}

.monthContainer {
	width:100%;
}

.monthLabelContainer {
	text-align:center;
	font:bold 0.75em Helvetica, Arial, Verdana, sans-serif;
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpMonthBg.png) repeat-x top left !important;
	color:#293a4b;
	padding:0.25em;
}

.monthCurve {
	width:12px;
}

.monthCurveTL {
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpCurveTL.png) no-repeat top left !important;
}

.monthCurveTR {
		background: url(/logistic/struts/dojo/src/widget/templates/images/dpCurveTR.png) no-repeat top right !important;
}


.yearWrapper {
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpHorizLineFoot.gif) top left repeat-x;
	padding-top:2px;
}

.yearContainer {
	width:100%;
}

.yearContainer td {
	background:url(/logistic/struts/dojo/src/widget/templates/images/dpYearBg.png) top left repeat-x;
}

.yearContainer .yearLabel {
	margin:0;
	padding:0.45em 0 0.45em 0;
	color:#fff;
	font:bold 0.75em Helvetica, Arial, Verdana, sans-serif;
	text-align:center;
}

.curveBL {
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpCurveBL.png) bottom left no-repeat !important;
	width:9px !important;
	padding:0;
	margin:0;
}

.curveBR {
	background: url(/logistic/struts/dojo/src/widget/templates/images/dpCurveBR.png) bottom right no-repeat !important;
	width:9px !important;
	padding:0;
	margin:0;
}


.previousMonth {
	background-color:#6782a8 !important;
}

.previousMonthDisabled {
	background-color:#a4a5a6 !important;
	cursor:default !important
}
.currentMonth {
}

.currentMonthDisabled {
	background-color:#bbbbbc !important;
	cursor:default !important
}
.nextMonth {
	background-color:#6782a8 !important;
}
.nextMonthDisabled {
	background-color:#a4a5a6 !important;
	cursor:default !important;
}

.currentDate {
	text-decoration:underline;
	font-style:italic;
}

.selectedDate {
	background-color:#fff !important;
	color:#6782a8 !important;
}

.yearLabel .selectedYear {
	padding:0.2em;
	background-color:#9ec3fb !important;
}

.nextYear, .previousYear {
	cursor:pointer;cursor:hand;
	padding:0;
}

.nextYear {
	margin:0 0 0 0.55em;
}

.previousYear {
	margin:0 0.55em 0 0;
}

.incrementControl {
	cursor:pointer;cursor:hand;
	width:1em;
}

.increase {
	float:right;
}

.decrease {
	float:left;
}

.lastColumn {
	background-image:none !important;
}


#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}







		
	        label, .label { display: inline; }
	        span.errorMessage{ display: none; }
        
        
        	table#myTableInf tr {
        		border: 1px solid #D9D9D9;
        	}
        
             
        	function FrmSubmit()
			{  
			
        		var frmDt = trim(document.perForm.from.value);
        		var toDt = trim(document.perForm.to.value);
        	    var Service = trim(document.perForm.filterService.value);
        		
        		if(frmDt == &quot;&quot; || toDt == &quot;&quot; || Service == &quot;&quot;)
       			{
        			document.getElementById('showerror').style.display = '';
        			return false;
       			}
        		else
        		{
        			document.getElementById('showerror').style.display = 'none';
        			return true;
        		}
        		
			}
        	
        	function trim(s) {
        	    return s.replace( /^\s*/, &quot;&quot; ).replace( /\s*$/, &quot;&quot; );
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
												
									
										
										
									 
										
																				
									
								
                       
                       
                       
                        
                    
                
                
             
         
        
		
			
			
 
            
            
            
     
				
						» Please select all search criteria.
				
	   









Process Filter:(reset)

	
		
			
    From:
     
	
		
			
				
					
						
							
							
								
									
								
								
									
								
								
									
								
								
									
								
								undefined
							
							
						
					
				
			
		
		
			
				
					
						
							
								S
								M
								T
								W
								T
								F
								S
							
						
						
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
							
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
							
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
							
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
							
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
							
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
								NaN
							
					
				
			
		
		
			
				
					
						
							
							
								
									0NaN
									0NaN
									0NaN
								
							
							
						
					
				
			
		
	




djConfig.searchIds.push(&quot;widget_1424532248&quot;);

			
			
    To:
     
	
		
			
				
					
						
							
							
								
									
								
								
									
								
								
									
								
								
									
								
								October
							
							
						
					
				
			
		
		
			
				
					
						
							
								S
								M
								T
								W
								T
								F
								S
							
						
						
								30
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
								9
								10
							
					
				
			
		
		
			
				
					
						
							
							
								
									2017
									2018
									2019
								
							
							
						
					
				
			
		
	




djConfig.searchIds.push(&quot;widget_1153976343&quot;);

			
    service:
    
    -- Please Select --
    Road Tax
    Insolvency
    Immigration
    Immigration Maid
    Immigration FW
    CDL
    1MID
    SPANCO Road Tax
    LEGALISATION
    Legalisation Delivery
    Roadtax SS
    JPJ1M
    IMI1M
    ETMS








			
		
	




	
	

 








 

			
			
			
			
         
				
           
        
        
        	
            	    
                	

                	All logos and trademarks in this site are the property of their respective owners.© 2000-2015 MyEG Services Berhad. All Rights Reserved. 
        		
            
            
         
	
/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
   </webElementProperties>
</WebElementEntity>
