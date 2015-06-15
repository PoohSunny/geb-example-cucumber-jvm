package pages

import geb.Page

class OneEventPage extends Page {
	static at = { $('h1').text() == 'this is one event page' }
}
