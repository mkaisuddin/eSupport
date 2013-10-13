<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<div style="padding: 16px; background-color: #4EB889; height: 520px;">
	<h2>Advance Search</h2>
	<div style="color: red">
		<html:errors />
	</div>

	<html:form action="/AdvanceSearch.do">

		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="case.label.id" />
				:
			</div>

			<html:text property="id" size="40" maxlength="20" />
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
				<bean:message key="search.label.fromDate" />
				:
			</div>

			<html:text property="fromDate" size="40" maxlength="20" />
		</div>

		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="search.label.toDate" />
				:
			</div>

			<html:text property="toDate" size="40" maxlength="20" />
		</div>

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<html:submit>
					<bean:message key="stage.label.button.submit" />
				</html:submit>
			</div>
			<html:reset>
				<bean:message key="stage.label.button.reset" />
			</html:reset>
		</div>

	</html:form>

	<br>
<logic:notEmpty name="advanceSearchForm" property="caseList">
	<h2>Case Search Details</h2>

	<table border="1">
		<tr>
			<td>Case ID</td>
			<td>Next Date</td>
			<td>Comments</td>
			<td>Special Notes</td>
		</tr>
		
		<logic:iterate id="case1" name="advanceSearchForm" property="caseList">
			<tr>
				<td><html:link action="/AddCase.do" paramId="id" paramName="case1" paramProperty="id"><bean:write name="case1" property="id" /></html:link></td>
				<td><bean:write name="case1" property="nextDate" /></td>
				<td><bean:write name="case1" property="comments" /></td>
				<td><bean:write name="case1" property="specialNotes" /></td>
				
			</tr>
		</logic:iterate>

	</table>
</logic:notEmpty>

<logic:empty name="advanceSearchForm" property="caseList">
	<h2>Case Search Details</h2>

	<table border="1">
		<tr>
			<td>Case ID</td>
			<td>Next Date</td>
			<td>Comments</td>
			<td>Special Notes</td>
		</tr>
		
		
			<tr>
				<td colspan="4">No Results Found</td>
				
			</tr>
		

	</table>
</logic:empty>
</div>