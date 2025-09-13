package com.home.cp.services

import com.home.common.services.remotes.RemoteFetcherService

class CPRemoteFetcherService extends RemoteFetcherService[CPFetchIn, CPRemoteData] {

  override def fetch(in: CPFetchIn): CPRemoteData = {
    // TODO : faire les call lol
    CPRemoteData(
      cpInfo = "whatever"
    )
  }
}
