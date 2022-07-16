import axios from 'axios'
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../Utils/request'
import './style.css'

type Props = {
  saleId: number
}

function hendleClik(id: number) {
  axios(`${BASE_URL}/Sales/${id}/Notification`).then(response => {
    console.log('SUCESSO')
  })
}

function NotificationButton({ saleId }: Props) {
  return (
    <>
      <div className="dsmeta-red-btn" onClick={() => hendleClik(saleId)}>
        <img src={icon} alt="Notificar" />
      </div>
    </>
  )
}

export default NotificationButton
