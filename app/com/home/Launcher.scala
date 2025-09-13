package com.home

import com.home.common.cmd.GenererDocumentCommand
import com.home.common.services.SimpleDocumentGenerator
import com.home.common.services.remotes.{BaseFetchIn, BaseFetchInBuilder, BaseRemoteData}
import com.home.cp.cmd.CPCommand
import com.home.cp.services.{CPFetchIn, CPFetchInBuilder, CPRemoteData, CPRemoteFetcherService}
import com.home.cv.cmd.CVCommand

object Launcher extends App {
  println("wip")

  val cpfetchInBuilder = new CPFetchInBuilder()
  val cpRemoteFetcher = new CPRemoteFetcherService()

  val cpGenerator =
    new SimpleDocumentGenerator[CPCommand, CPFetchIn, CPRemoteData](
      cpfetchInBuilder,
      cpRemoteFetcher
    )

  val cp2Generator =
    new SimpleDocumentGenerator[CPCommand, CPFetchIn, CPRemoteData](
      cpfetchInBuilder,
      cpRemoteFetcher
    )

  val r: List[SimpleDocumentGenerator[_, _, _]] = List(cpGenerator, cp2Generator)

  val cmd: GenererDocumentCommand = CPCommand()

  val result = cmd match {
    case cp: CPCommand => cp2Generator.compute(cp)
    case cv: CVCommand => "xxx"
    case _ => "xxx"
  }

  println(result)
}
