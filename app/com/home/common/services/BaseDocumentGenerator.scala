package com.home.common.services

import com.home.common.cmd.GenererDocumentCommand
import com.home.common.services.remotes.{BaseFetchIn, BaseRemoteData}

trait BaseDocumentGenerator[CMD <: GenererDocumentCommand, FI <: BaseFetchIn, RD <: BaseRemoteData] {

  def compute(cmd: CMD): String
}
