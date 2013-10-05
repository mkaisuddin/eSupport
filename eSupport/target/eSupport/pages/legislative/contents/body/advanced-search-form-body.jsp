<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="padding: 16px; background-color: #4EB889; height: 520px;">
	<h2>Advance Search</h2>
<div style="color:red">
	<html:errors/>
</div>

<html:form action="/AdvancedSearch.do">

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="case.label.id" /> : 
	</div> 
 
	<html:text property="id" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="advocate.label.firstName" /> : 
	</div> 
 
	<html:text property="firstName" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="advocate.label.lastName" /> : 
	</div> 
 
	<html:text property="lastName" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="search.label.fromDate" /> : 
	</div> 
 
	<html:text property="fromDate" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="search.label.toDate" /> : 
	</div> 
 
	<html:text property="toDate" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<html:submit>
             <bean:message key="stage.label.button.submit" />
        </html:submit>
	</div>
	<html:reset>
          <bean:message key="stage.label.button.reset" />
     </html:reset>
</div>
 
</html:form>
</div>