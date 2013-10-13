<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div style="padding: 16px; background-color: #4EB889; height: 520px;">
	<h2>Add Case Details</h2>
	<div style="color: red">
		<html:errors />
	</div>

	<html:form action="/AddCase.do">
		<table>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.prevDate" />
							:
						</div>

						<html:text property="prevDate" size="40" maxlength="20" />
					</div></td>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.comments" />
							:
						</div>

						<html:textarea name="caseForm" property="comments" cols="50" rows="2" />
					</div></td>
			<tr>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.court" />
							:
						</div>

						<html:text property="court" size="40" maxlength="20" />
					</div></td>
				<td></td>
			<tr>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.client" />
							:
						</div>

						<html:text property="client" size="40" maxlength="20" />
					</div></td>
				<td></td>
			<tr>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.opponent" />
							:
						</div>

						<html:text property="opponent" size="40" maxlength="20" />
					</div></td>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.specialNotes" />
							:
						</div>

						<html:textarea property="specialNotes" cols="50" rows="2" />
					</div></td>
			<tr>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.currentStage" />
							:
						</div>

						<html:text property="currentStage" size="40" maxlength="20" />
					</div></td>
				<td></td>
			<tr>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.nextStage" />
							:
						</div>

						<html:text property="nextStage" size="40" maxlength="20" />
					</div></td>
				<td></td>
			<tr>
			<tr>
				<td><div style="padding: 16px">
						<div style="float: left; width: 100px;">
							<bean:message key="case.label.nextDate" />
							:
						</div>

						<html:text property="nextDate" size="40" maxlength="20" />
					</div></td>
				<td></td>
			<tr>
			<tr>
				<td><div style="float: left; padding-right: 8px;">
						<html:submit>
							<bean:message key="case.label.button.submit" />
						</html:submit>
					</div></td>
				<td><html:reset>
						<bean:message key="case.label.button.reset" />
					</html:reset></td>
			<tr>
			<tr>
				<td></td>
				<td></td>
			<tr>
			<tr>
				<td></td>
				<td></td>
			<tr>
		</table>
	</html:form>
</div>