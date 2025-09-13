package com.home.cmd

sealed trait GenererDocumentCommand {

}

final case class CVCommand() extends GenererDocumentCommand
final case class CPCommand() extends GenererDocumentCommand
