// Generated from Carrentalnew.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CarrentalnewParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CarrentalnewVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#pola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola(@NotNull CarrentalnewParser.PolaContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#modalobligasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModalobligasi(@NotNull CarrentalnewParser.ModalobligasiContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull CarrentalnewParser.ConjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#numberedQuantification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberedQuantification(@NotNull CarrentalnewParser.NumberedQuantificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull CarrentalnewParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull CarrentalnewParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#thentoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThentoken(@NotNull CarrentalnewParser.ThentokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#quantification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantification(@NotNull CarrentalnewParser.QuantificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(@NotNull CarrentalnewParser.DisjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull CarrentalnewParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(@NotNull CarrentalnewParser.NounContext ctx);

	/**
	 * Visit a parse tree produced by the {@code term_type3}
	 * labeled alternative in {@link CarrentalnewParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_type3(@NotNull CarrentalnewParser.Term_type3Context ctx);

	/**
	 * Visit a parse tree produced by the {@code term_type2}
	 * labeled alternative in {@link CarrentalnewParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_type2(@NotNull CarrentalnewParser.Term_type2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#iftoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIftoken(@NotNull CarrentalnewParser.IftokenContext ctx);

	/**
	 * Visit a parse tree produced by the {@code term_type1}
	 * labeled alternative in {@link CarrentalnewParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_type1(@NotNull CarrentalnewParser.Term_type1Context ctx);

	/**
	 * Visit a parse tree produced by the {@code ifthenelse_1}
	 * labeled alternative in {@link CarrentalnewParser#kalimatifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse_1(@NotNull CarrentalnewParser.Ifthenelse_1Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_statement_4}
	 * labeled alternative in {@link CarrentalnewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_statement_4(@NotNull CarrentalnewParser.Pola_statement_4Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_statement_3}
	 * labeled alternative in {@link CarrentalnewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_statement_3(@NotNull CarrentalnewParser.Pola_statement_3Context ctx);

	/**
	 * Visit a parse tree produced by the {@code obligasi_4}
	 * labeled alternative in {@link CarrentalnewParser#obligasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObligasi_4(@NotNull CarrentalnewParser.Obligasi_4Context ctx);

	/**
	 * Visit a parse tree produced by the {@code ifthenelse_2}
	 * labeled alternative in {@link CarrentalnewParser#kalimatifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse_2(@NotNull CarrentalnewParser.Ifthenelse_2Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_statement_5}
	 * labeled alternative in {@link CarrentalnewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_statement_5(@NotNull CarrentalnewParser.Pola_statement_5Context ctx);

	/**
	 * Visit a parse tree produced by the {@code obligasi_2}
	 * labeled alternative in {@link CarrentalnewParser#obligasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObligasi_2(@NotNull CarrentalnewParser.Obligasi_2Context ctx);

	/**
	 * Visit a parse tree produced by the {@code obligasi_1}
	 * labeled alternative in {@link CarrentalnewParser#obligasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObligasi_1(@NotNull CarrentalnewParser.Obligasi_1Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_DT_1}
	 * labeled alternative in {@link CarrentalnewParser#dt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_DT_1(@NotNull CarrentalnewParser.Pola_DT_1Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_DT_3}
	 * labeled alternative in {@link CarrentalnewParser#dt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_DT_3(@NotNull CarrentalnewParser.Pola_DT_3Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_DT_2}
	 * labeled alternative in {@link CarrentalnewParser#dt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_DT_2(@NotNull CarrentalnewParser.Pola_DT_2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CarrentalnewParser#sbvr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSbvr(@NotNull CarrentalnewParser.SbvrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_statement_2}
	 * labeled alternative in {@link CarrentalnewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_statement_2(@NotNull CarrentalnewParser.Pola_statement_2Context ctx);

	/**
	 * Visit a parse tree produced by the {@code pola_statement_1}
	 * labeled alternative in {@link CarrentalnewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPola_statement_1(@NotNull CarrentalnewParser.Pola_statement_1Context ctx);
}