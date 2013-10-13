<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="http://localhost:8080/eSupport/pages/legislative/tiles/templates/style.css">
<script src="http://localhost:8080/eSupport/pages/legislative/tiles/templates/site.js"></script>
<link>

<!-- prefix free to deal with vendor prefixes -->
<script src="http://thecodeplayer.com/uploads/js/prefixfree-1.0.7.js"
	type="text/javascript" type="text/javascript"></script>

<!-- jQuery -->
<script src="http://thecodeplayer.com/uploads/js/jquery-1.7.1.min.js"
	type="text/javascript"></script>
<title>eSupport - One place everything you needed</title>
</head>
<body>
	<tiles:insert attribute="header" />

	<tiles:insert attribute="navigation" />

	<tiles:insert attribute="body" />

	<tiles:insert attribute="footer" />
	
	<a href="http://info.flagcounter.com/wFSP"><img src="http://s10.flagcounter.com/count/wFSP/bg_FFFFFF/txt_000000/border_CCCCCC/columns_2/maxflags_12/viewers_0/labels_1/pageviews_1/flags_1/" alt="Flag Counter" border="0"></a>
</body>
</html>