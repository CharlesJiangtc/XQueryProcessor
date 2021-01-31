// Generated from E:/IntelliJ IDEA 2020.3.1/projects/milestone1/.idea\Xpath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XpathParser}.
 */
public interface XpathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XpathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XpathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XpathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpathParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XpathParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpathParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XpathParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_children}
	 * labeled alternative in {@link XpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_children(XpathParser.Ap_childrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_children}
	 * labeled alternative in {@link XpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_children(XpathParser.Ap_childrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_all(XpathParser.Ap_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XpathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_all(XpathParser.Ap_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_txt}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_txt(XpathParser.Rp_txtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_txt}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_txt(XpathParser.Rp_txtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_attName}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_attName(XpathParser.Rp_attNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_attName}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_attName(XpathParser.Rp_attNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_parent}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_parent(XpathParser.Rp_parentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_parent}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_parent(XpathParser.Rp_parentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_sibling}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_sibling(XpathParser.Rp_siblingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_sibling}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_sibling(XpathParser.Rp_siblingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_descendant}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_descendant(XpathParser.Rp_descendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_descendant}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_descendant(XpathParser.Rp_descendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_self}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_self(XpathParser.Rp_selfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_self}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_self(XpathParser.Rp_selfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_children}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_children(XpathParser.Rp_childrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_children}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_children(XpathParser.Rp_childrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_tagName(XpathParser.Rp_tagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_tagName(XpathParser.Rp_tagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_merge}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_merge(XpathParser.Rp_mergeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_merge}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_merge(XpathParser.Rp_mergeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(XpathParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(XpathParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_all}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_all(XpathParser.Rp_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_all}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_all(XpathParser.Rp_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(XpathParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(XpathParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(XpathParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(XpathParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_parent}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_parent(XpathParser.Filter_parentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_parent}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_parent(XpathParser.Filter_parentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(XpathParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(XpathParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_txt}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_txt(XpathParser.Filter_txtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_txt}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_txt(XpathParser.Filter_txtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_equal(XpathParser.Filter_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_equal(XpathParser.Filter_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(XpathParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(XpathParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(XpathParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(XpathParser.Filter_notContext ctx);
}