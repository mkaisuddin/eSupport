<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="padding: 16px; background-color: #4EB889; height: 520px;">
	<h2>Add Court Details</h2>
	<div style="color: red">
		<html:errors />
	</div>

	<html:form action="/AddCourt.do">

		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="court.label.name" />
				:
			</div>

			<html:text property="name" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="court.label.address" />
				:
			</div>

			<html:textarea property="address" cols="50" rows="10" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="court.label.deskPhone" />
				:
			</div>

			<html:text property="deskPhone" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="court.label.mobile" />
				:
			</div>

			<html:text property="mobile" size="40" maxlength="20" />
		</div>
		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="court.label.www" />
				:
			</div>

			<html:text property="www" size="40" maxlength="20" />
		</div>
		

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<html:submit>
					<bean:message key="court.label.button.submit" />
				</html:submit>
			</div>
			<html:reset>
				<bean:message key="court.label.button.reset" />
			</html:reset>
		</div>

	</html:form>
</div>