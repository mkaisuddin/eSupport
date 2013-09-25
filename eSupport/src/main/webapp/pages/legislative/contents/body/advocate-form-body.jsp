<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="padding: 16px; background-color: #4EB889; height: 520px;">
	<h2>Add Advocate Details</h2>
	<div style="color: red">
		<html:errors />
	</div>

	<html:form action="/AddAdvocate.do">

		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.advUserName" />
				:
			</div>

			<html:text property="advUserName" size="40" maxlength="20" />
		</div>
		
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.password" />
				:
			</div>

			<html:text property="password" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.firstName" />
				:
			</div>

			<html:text property="firstName" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.lastName" />
				:
			</div>

			<html:text property="lastName" size="40" maxlength="20" />
		</div>
		
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.dob" />
				:
			</div>

			<html:text property="dob" size="40" maxlength="20" />
		</div>
		
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.address" />
				:
			</div>

			<html:textarea property="address" cols="50" rows="10" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.deskPhone" />
				:
			</div>

			<html:text property="deskPhone" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.mobile" />
				:
			</div>

			<html:text property="mobile" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="advocate.label.email" />
				:
			</div>

			<html:text property="email" size="40" maxlength="20" />
		</div>
		

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<html:submit>
					<bean:message key="advocate.label.button.submit" />
				</html:submit>
			</div>
			<html:reset>
				<bean:message key="advocate.label.button.reset" />
			</html:reset>
		</div>

	</html:form>
</div>