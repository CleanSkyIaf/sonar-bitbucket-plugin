  private def readFile(path: String) =
    scala.io.Source.fromInputStream(getClass.getResourceAsStream(path)).mkString

  "diff headers mode" should {
  }

  "diff headers copy" should {

  }

  "diff headers rename and similarity" should {
          index = Option(Index(fromHash = "f3e63d7", toHash = "e8f44ba", mode = Some(100644)))
          index = Option(Index(fromHash = "f3e63d7", toHash = "e8f44ba", mode = Some(100644))))
            fromToRange = FromToRange(fromLineStart = 1, fromNumLines = Some(8), toLineStart = 1, toNumLines = Some(9)),
            fromToRange = FromToRange(fromLineStart = 18, fromNumLines = Some(6), toLineStart = 19, toNumLines = Some(8)),
            index = Option(Index(fromHash = "57b70a8", toHash = "fc8f0d5", mode = Option(100755)))),
              fromToRange = FromToRange(fromLineStart = 12, fromNumLines = None, toLineStart = 12, toNumLines = None),
              fromToRange = FromToRange(fromLineStart = 16, fromNumLines = None, toLineStart = 16, toNumLines = None),
              fromToRange = FromToRange(fromLineStart = 17, fromNumLines = Some(0), toLineStart = 18, toNumLines = Some(8)),
            index = Option(Index(fromHash = "4545ecc", toHash = "0000000", mode = None))),
              fromToRange = FromToRange(fromLineStart = 1, fromNumLines = Some(40), toLineStart = 0, toNumLines = Some(0)),
            index = Option(Index(fromHash = "356f4b7", toHash = "f5b8743", mode = Some(100755)))),
              fromToRange = FromToRange(fromLineStart = 26, fromNumLines = Some(2), toLineStart = 26, toNumLines = Some(2)),
              fromToRange = FromToRange(fromLineStart = 40, fromNumLines = Some(0), toLineStart = 41, toNumLines = Some(7)),
            index = Option(Index(fromHash = "f3e63d7", toHash = "e8f44ba", mode = Some(100644)))),
              fromToRange = FromToRange(fromLineStart = 1, fromNumLines = Some(8), toLineStart = 1, toNumLines = Some(9)),
              fromToRange = FromToRange(fromLineStart = 18, fromNumLines = Some(6), toLineStart = 19, toNumLines = Some(8)),
      allDiffs must succeedOn(readFile("/diffs/2diffs-example.diff"))
      allDiffs must succeedOn(readFile("/diffs/5diffs-example.diff"))
      allDiffs must succeedOn(readFile("/diffs/u0085-char-issue.txt"))
    "Github issue #8" in {
      allDiffs must succeedOn(readFile("/diffs/github#8.txt"))
    }

    "Github issue #8 no newline at eof" in {
      allDiffs must succeedOn(readFile("/diffs/github#8-no-newline-at-eof.txt"))
    }

    "Github issue #8 wrong example 1" in {
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong1.txt"))
    }

    "Github issue #8 wrong example 3" in {
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong3.txt"))
    }

    "Github issue #8 wrong example 4" in {
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong4.txt"))
    }

    "Github issue #10 no index existing" in {
      allDiffs must succeedOn(readFile("/diffs/github#10-no-index.txt"))
    }
    
    "Github issue #10 carriage return issue" in {
      allDiffs must succeedOn(readFile("/diffs/diff_pr_153_ko.diff.txt"))
    }

    "Github issue #8 failing diff" in {
      allDiffs must succeedOn(readFile("/diffs/failing-diff.txt")).withResult(
        List(
          GitDiff(
            FileChange("dev/bin/custom/connector/project.properties",
                       "dev/bin/custom/connector/project.properties"),
            ExtendedDiffHeader(List(NewFileMode(100644)), Option(Index("0000000", "a244253", None))),
            List(
              Hunk(
                HunkHeader(FromToRange(0, Some(0), 1, Some(5)), None),
                List(
                  AddedLine(""),
                  AddedLine("lorealprotogoconnector.key=value"),
                  AddedLine(""),
                  AddedLine("# Specifies the location of the spring context file"),
                  AddedLine("connector.application-context=connector-spring.xml"),
                  CtxLine("\\ No newline at end of file")
                )
              )
            )
          )
        )
      )
    }

      allDiffs must succeedOn(readFile("/diffs/PR140.diff")).withResult(
            header = ExtendedDiffHeader(List(DeletedFileMode(100644)), Option(Index("27e8967", "0000000", None))),
                HunkHeader(FromToRange(1, Some(42), 0, Some(0)), None),
              List(NewFileMode(100644)),Option(Index("0000000","a54bbbb",None))
                HunkHeader(FromToRange(0,Some(0),1,Some(12)),None),