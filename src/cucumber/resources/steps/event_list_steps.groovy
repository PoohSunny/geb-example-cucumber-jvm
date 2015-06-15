import pages.*

import static cucumber.api.groovy.JA.*

もし(~/^イベント一覧ページを表示する$/) { ->
	to EventsPage
}

ならば(~/^過去のイベントが複数件表示されている$/) { ->
	at EventsPage
	assert page.events.size() > 1
}
