import pages.*

import static cucumber.api.groovy.JA.*

もし(~/^イベント一覧ページを表示する$/) { ->
	to EventsPage
}

ならば(~/^過去のイベントが複数件表示されている$/) { ->
	at EventsPage
	assert page.events.size() > 1
}

もし(~/^表示されている一番上のイベントの情報をクリックする$/) { ->
	// Write code here that turns the phrase above into concrete actions
	throw new PendingException()
}

ならば(~/^イベントの詳細ページが表示される$/) { ->
	// Write code here that turns the phrase above into concrete actions
	throw new PendingException()
}
