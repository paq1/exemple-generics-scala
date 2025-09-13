package com.home.common.services

import com.home.common.cmd.GenererDocumentCommand
import com.home.common.services.remotes.{BaseFetchIn, BaseFetchInBuilder, BaseRemoteData, RemoteFetcherService}

class SimpleDocumentGenerator[
    CMD <: GenererDocumentCommand,
    FI <: BaseFetchIn,
    RD <: BaseRemoteData
](
    fetchInBuilder: BaseFetchInBuilder[CMD, FI],
    remoteFetcher: RemoteFetcherService[FI, RD]
) extends BaseDocumentGenerator[CMD, FI, RD] {

  override def compute(cmd: CMD): String = {

    val fi = fetchInBuilder.build(cmd)
    val remoteData = remoteFetcher.fetch(fi)

    "win"
  }
}
