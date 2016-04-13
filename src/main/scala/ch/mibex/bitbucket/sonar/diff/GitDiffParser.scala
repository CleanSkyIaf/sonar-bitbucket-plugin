  case class ExtendedDiffHeader(headerLines: Seq[HeaderLine], index: Option[Index])
  case class FromToRange(fromLineStart: Int, fromNumLines: Option[Int], toLineStart: Int, toNumLines: Option[Int])
  def gitDiff: Parser[GitDiff] = gitDiffHeader ~ extendedDiffHeader ~ hunks ^^ {
  def nl: Parser[String] = """(\r?\n)+""".r
    ) ~ opt(index) ^^
  def lineChange: Parser[LineChange] = ctxLine | addedLine | removedLine | noNewLineAtEOF | newLine
        FromToRange(startLineFrom, optNumLinesFrom, startLineTo, optNumLinesTo)
  def noNewLineAtEOF: Parser[CtxLine] = "\\ No newline at end of file" <~ opt(nl) ^^ { l => CtxLine(l) }

  def newLine: Parser[CtxLine] = nl ^^ { l => CtxLine("") }
