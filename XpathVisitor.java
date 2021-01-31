// Generated from E:/IntelliJ IDEA 2020.3.1/projects/milestone1/.idea\Xpath.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XpathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XpathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XpathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XpathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link XpathParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(XpathParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ap_children}
	 * labeled alternative in {@link XpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_children(XpathParser.Ap_childrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ap_all}
	 * labeled alternative in {@link XpathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_all(XpathParser.Ap_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_txt}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_txt(XpathParser.Rp_txtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_attName}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_attName(XpathParser.Rp_attNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_parent}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_parent(XpathParser.Rp_parentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_sibling}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_sibling(XpathParser.Rp_siblingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_descendant}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_descendant(XpathParser.Rp_descendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_self}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_self(XpathParser.Rp_selfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_children}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_children(XpathParser.Rp_childrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_tagName(XpathParser.Rp_tagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_merge}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_merge(XpathParser.Rp_mergeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_filter(XpathParser.Rp_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_all}
	 * labeled alternative in {@link XpathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_all(XpathParser.Rp_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(XpathParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_and(XpathParser.Filter_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_parent}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_parent(XpathParser.Filter_parentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_is(XpathParser.Filter_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_txt}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_txt(XpathParser.Filter_txtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_equal(XpathParser.Filter_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_or(XpathParser.Filter_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XpathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(XpathParser.Filter_notContext ctx);
}