package client

import akka.actor.Actor.Receive
import akka.actor.{Actor, ActorLogging}

/** The ClientActor is an actor inside every client side connection
  *
  * The ClientActor is a low level entity which is responsible to connect as a cluster member to the cluster,
  * but with a special `client` role. It is
  *
 */

class ClientActor extends Actor with ActorLogging{
  override def receive: Receive = {
    case _=>
  }
}
