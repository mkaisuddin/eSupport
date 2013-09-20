<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="padding: 16px; background-color: blue; height: 520px;">
	<h2>Add Customer</h2>
<div style="color:red">
	<html:errors/>
</div>

<html:form action="/AddStage.do">

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="stage.label.name" /> : 
	</div> 
 
	<html:text property="name" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="stage.label.address" /> : 
	</div> 
 
	<html:textarea property="description" cols="50" rows="10"/>
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