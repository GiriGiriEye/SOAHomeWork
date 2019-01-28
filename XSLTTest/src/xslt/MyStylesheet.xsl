<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tns="http://jw.nju.edu.cn/schema">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<课程成绩列表>
		<xsl:for-each select="tns:学生列表/学生/课程成绩列表/课程成绩">
			<xsl:sort select="成绩/得分"/>
				<课程成绩>
				<xsl:attribute name="成绩性质">
					<xsl:value-of select="@成绩性质"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="课程编号">
					<xsl:value-of select="@课程编号"></xsl:value-of>
				</xsl:attribute>
					<成绩>
						<学号>
							<xsl:value-of select="成绩/学号"></xsl:value-of>
						</学号>
						<得分>
							<xsl:value-of select="成绩/得分"></xsl:value-of>
						</得分>
					</成绩>
				</课程成绩>
			</xsl:for-each>
		</课程成绩列表>
	</xsl:template>	
</xsl:stylesheet>