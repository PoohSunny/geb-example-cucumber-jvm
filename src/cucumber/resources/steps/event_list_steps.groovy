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
	page.firstEventLink.click()
}

ならば(~/^イベントの詳細ページが表示される$/) { ->
	at OneEventPage
}
